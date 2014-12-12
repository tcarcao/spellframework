package sell;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import sell.input.DataRetrieved;
import sell.input.SemanticsCheck;

public class Main {

    public static void main(String[] args) throws Exception {
        String input =  "[ e=2, t=120.0 ] [ e=2 ] [ e=2 ] _ > 0 | 0\n" +
                        "[ cpu=2, t=1.0 ] [ fans=2 ] 0 [ t=2, n=4 ] > 0 | 0";
        MatrixLexer lexer = new MatrixLexer(new ANTLRStringStream(input));
        MatrixParser parser = new MatrixParser(new CommonTokenStream(lexer));
        DataRetrieved data = parser.parse();
        
        SemanticsCheck.checkSemantics(data);
        ComponentSample[][] matrix = data.getComponentsMatrix();
        
        for (ComponentSample[] vector : matrix) {
            for (ComponentSample component : vector) {
                System.out.print(component.toStringUsedOrNot()+ " ");
            }
            System.out.println();
        }
    }
}
