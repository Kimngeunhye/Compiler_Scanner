package MiniC;

import MiniC.Scanner.Scanner;
import MiniC.Scanner.SourceFile;
import MiniC.Scanner.Token;

public class MiniC{
	private static Scanner scanner;
	
	public static void main(String[] args){
		if (args.length != 1) {
			System.out.println("Usage: java MiniC.java [file_name]\n");
			System.exit(1);
		}
		String sourceFile = args[0];

		Token t;

		System.out.println("******** " + "MiniC Compiler" + " ********");
		System.out.println("Lexical Analysis ...");

		SourceFile source = new SourceFile(sourceFile);
		scanner = new Scanner(source);
		scanner.enableDebugging();
		do{
			t = scanner.scan();	// scan 1 token
		} while (t.kind != Token.EOF);

	}
}