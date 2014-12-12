package output;

import genericTree.Node;
import genericTree.Tree;
import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

public class BuildSELLMatrixFromCOutput {

    public static void main(String[] args) throws Exception {
        String input =  "> funcao_A ( m = graph, t = 1, e=2.3 )\n" +
                        "> funcao_B ( m = graph, t = 1, e=2.3 )\n" +
                        "> funcao_C ( m = graph, t = 1, e=2.3 )\n" +
                        "< funcao_C ( m = graph, t = 2, e=2.3 )\n" +
                        "> funcao_A ( m = graph, t = 1, e=2.3 )\n" +
                        "< funcao_A ( m = graph, t = 2, e=2.3 )\n" +
                        "< funcao_B ( m = graph, t = 3, e=2.3 )\n" +
                        "> funcao_D ( m = graph, t = 1, e=2.3 )\n" +
                        "< funcao_D ( m = graph, t = 4, e=2.3 )\n" +
                        "> funcao_E ( m = graph, t = 1, e=2.3 )\n" +
                        "< funcao_E ( m = graph, t = 5, e=2.3 )\n" +
                        "< funcao_A ( m = graph, t = 5, e=2.3 )\n";
        OutputLexer lexer = new OutputLexer(new ANTLRStringStream(input));
        OutputParser parser = new OutputParser(new CommonTokenStream(lexer));
        Tree<ComponentNode> tree = parser.output();
        
        //tree.prettyPrintTree();

        ArrayList<ComponentNode> totalComponents = TreeComponentUtility.getComponentNodesTotal(tree);
        
        for (ComponentNode totalComponent : totalComponents) {
            System.out.println(totalComponent);
        }
        
    }
    
}
