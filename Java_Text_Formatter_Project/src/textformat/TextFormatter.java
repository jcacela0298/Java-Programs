package textformat;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class TextFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputfilePath;
        File inputFile = null;
        String outputfilePath;
        File outputFile = null;
        int maxWidth;

        // Step 1: Prompt for input file
        do {
            System.out.print("Enter the path of the input text file: ");
            inputfilePath = scanner.nextLine();
            inputFile = new File(inputfilePath);

            if (!inputFile.exists() || !inputFile.canRead()) {
                System.out.println("File does not exist or cannot be read. Please enter a valid file name.");
            }
        } while (!inputFile.exists() || !inputFile.canRead());

        
        // Step 2: Prompt for output file
        do {
            System.out.print("Enter the name of the output text file: ");
            outputfilePath = scanner.nextLine();
            outputFile = new File(outputfilePath);
            if (outputFile.exists()) {
                System.out.print("The file already exists. Do you want to overwrite it? (yes/no): ");
                String overwriteChoice = scanner.nextLine();
                if (overwriteChoice.equalsIgnoreCase("yes")) {
                    break; // User chooses to overwrite the file
                } else {
                    System.out.println("Please enter a different file name.");
                }
            }
        } while (outputFile.exists());



        // Step 3: Open the input file for reading and output file for writing
        try (Scanner fileScanner = new Scanner(inputFile);
             PrintWriter fileWriter = new PrintWriter(outputFile)) {
        // After opening the two files, we now prompt the user for maxWidth
            do {
                System.out.print("Enter the desired maximum number of characters per line (30-100): ");
                maxWidth = scanner.nextInt();
                if (maxWidth < 30 || maxWidth > 100) {
                    System.out.println("Invalid maxWidth. Please enter a number between 30 and 100.");
                }
            } while (maxWidth < 30 || maxWidth > 100);

            // Initialize the currentLine variable to keep track of the line being constructed
            String currentLine = "";

            // Add a line of asterisks at the top
            for (int i = 0; i < maxWidth; i++) {
                currentLine += "*";
            }
            fileWriter.println(currentLine);
            currentLine = "";

            // Add a line of spaces
            for (int i = 0; i < maxWidth; i++) {
                currentLine += " ";
            }
            fileWriter.println(currentLine);
            currentLine = "";
            
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                
                // Check if adding the word exceeds the maximum line width
                if ((currentLine + " " + word).length() <= maxWidth) {
                    // Append the word to the current line
                    if (!currentLine.isEmpty()) {
                        currentLine += " ";
                    }
                    currentLine += word;
                } else {
                    // Write the current line to the output file and reset it
                    fileWriter.println(currentLine);
                    currentLine = word;
                }
            }

            // Write any remaining content in the current line to the output file
            if (!currentLine.isEmpty()) {
                fileWriter.println(currentLine);
            }
            System.out.println("Transfer completed!");
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred while opening the file: " + e.getMessage());
        } finally {
            // Close the scanner when you're done with it
            scanner.close();
        }
    }
}
