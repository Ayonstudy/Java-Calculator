import java.io.File;import java.io.FileWriter;import java.io.IOException;public class Evaluator {public static void main(String args[]){int z =0;String A = String.valueOf(z);new File("Answer.txt");try {FileWriter myWriter = new FileWriter("Answer.txt");myWriter.write(A);myWriter.close();} catch (IOException i) {System.out.println("An error occurred.");i.printStackTrace();}}}