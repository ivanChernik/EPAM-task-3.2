package by.epam.tc.usage_parser.test;

import by.epam.traning_center.domain.Document;
import by.epam.traning_center.factory.DOMFactory;
import by.epam.traning_center.service.DOMParser;
import by.epam.traning_center.service.FileReaderSource;
import by.epam.traning_center.view.PrintIndividualDOMParserMenu;


public class TestParser {
	private static final String PATH = "src/by/epam/tc/usage_parser/xml/menu.xml";

	public static void main(String[] args) {
		DOMFactory factory = DOMFactory.getInstanse();
		DOMParser personalParser = factory.getParser();
		FileReaderSource fileReader = factory.getReader();
		personalParser.handleStringList(fileReader.readFile(PATH));
		Document document = personalParser.getDocument();
		PrintIndividualDOMParserMenu printParsedMenu = new PrintIndividualDOMParserMenu();
		printParsedMenu.printResult(document.getRootElement());
	}
}
