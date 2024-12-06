import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HuffmanCoding {
    private Map<Character, String> huffmanCodeMap = new HashMap<>();
    private PriorityQueue<Node> priorityQueue;

    public void buildHuffmanTree(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : text.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.frequency));

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node parent = new Node('0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            priorityQueue.add(parent);
        }
        generateHuffmanCodes(priorityQueue.peek(), "");
    }


    private void generateHuffmanCodes(Node node, String code) {
        if (node.left == null && node.right == null) {
            if (code.isEmpty()){
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

    public String encode(String text) {
        StringBuilder encodedString = new StringBuilder();
        for (char character : text.toCharArray()) {
            encodedString.append(huffmanCodeMap.get(character));
        }
        return encodedString.toString();
    }

    public Map<Character, String> getHuffmanCodeMap() {
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
            String text = new String(Files.readAllBytes(Paths.get(inputFilePath)));
            HuffmanCoding huffmanCoding = new HuffmanCoding();
            huffmanCoding.buildHuffmanTree(text);
            String encodedText = huffmanCoding.encode(text);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFilePath))) {
                oos.writeObject(huffmanCoding.getHuffmanCodeMap());
                oos.writeObject(encodedText);
            }
        } else if (operation.equals("decode")) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFilePath))) {
                Map<Character, String> huffmanCodeMap = (Map<Character, String>) ois.readObject();
                String encodedText = (String) ois.readObject();

                StringBuilder decodedString = new StringBuilder();
                String temp = "";
                for (char bit : encodedText.toCharArray()) {
                    temp += bit;
                    for (Map.Entry<Character, String> entry : huffmanCodeMap.entrySet()) {
                        if (entry.getValue().equals(temp)) {
                            decodedString.append(entry.getKey());
                            temp = "";
                            break;
                        }
                    }
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                    writer.write(decodedString.toString());
                }
            }
        }
    }
}



class Node {
    int frequency;
    char character;
    Node left;
    Node right;

    Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }
}