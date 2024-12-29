import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HuffmanCoding {
    private Map<Byte, String> huffmanCodeMap = new HashMap<>();
    private PriorityQueue<Node> priorityQueue;

    public void buildHuffmanTree(byte[] data) {
        Map<Byte, Integer> frequencyMap = new HashMap<>();
        for (byte b : data) {
            frequencyMap.put(b, frequencyMap.getOrDefault(b, 0) + 1);
        }

        priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.frequency));

        for (Map.Entry<Byte, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node parent = new Node((byte) 0, left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            priorityQueue.add(parent);
        }

        generateHuffmanCodes(priorityQueue.peek(), "");
    }

    private void generateHuffmanCodes(Node node, String code) {
        if (node.left == null && node.right == null) {
            if (code.isEmpty()) {
                huffmanCodeMap.put(node.character, "0");
                return;
            }
            huffmanCodeMap.put(node.character, code);
            return;
        }
        if (node.left != null) {
            generateHuffmanCodes(node.left, code + "0");
        }
        if (node.right != null) {
            generateHuffmanCodes(node.right, code + "1");
        }
    }

    public String encode(byte[] data) {
        StringBuilder encodedString = new StringBuilder();
        for (byte b : data) {
            encodedString.append(huffmanCodeMap.get(b));
        }
        return encodedString.toString();
    }

    public Map<Byte, String> getHuffmanCodeMap() {
        return huffmanCodeMap;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (args.length < 3) {
            System.out.println("Usage: java HuffmanCoding <encode/decode> <inputFile> <outputFile>");
            return;
        }

        String operation = args[0];
        String inputFilePath = args[1];
        String outputFilePath = args[2];

        if (operation.equals("encode")) {
            byte[] data = Files.readAllBytes(Paths.get(inputFilePath));
            HuffmanCoding huffmanCoding = new HuffmanCoding();
            huffmanCoding.buildHuffmanTree(data);
            String encodedText = huffmanCoding.encode(data);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFilePath))) {
                oos.writeObject(huffmanCoding.getHuffmanCodeMap());
                oos.writeObject(encodedText);
            }
        } else if (operation.equals("decode")) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFilePath))) {
                @SuppressWarnings("unchecked")
                Map<Byte, String> huffmanCodeMap = (Map<Byte, String>) ois.readObject();
                String encodedText = (String) ois.readObject();

                Map<String, Byte> reverseHuffmanCodeMap = new HashMap<>();
                for (Map.Entry<Byte, String> entry : huffmanCodeMap.entrySet()) {
                    reverseHuffmanCodeMap.put(entry.getValue(), entry.getKey());
                }

                List<Byte> decodedBytes = new ArrayList<>();
                StringBuilder temp = new StringBuilder();
                for (char bit : encodedText.toCharArray()) {
                    temp.append(bit);
                    if (reverseHuffmanCodeMap.containsKey(temp.toString())) {
                        decodedBytes.add(reverseHuffmanCodeMap.get(temp.toString()));
                        temp.setLength(0);
                    }
                }

                byte[] decodedData = new byte[decodedBytes.size()];
                for (int i = 0; i < decodedBytes.size(); i++) {
                    decodedData[i] = decodedBytes.get(i);
                }

                try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
                    fos.write(decodedData);
                }
            }
        }
    }
}

class Node {
    int frequency;
    byte character;
    Node left;
    Node right;

    Node(byte character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }
}
