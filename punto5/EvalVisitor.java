/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class EvalVisitor extends squealBaseVisitor<Integer> {
    /** "memory" for our calculator; variable/value pairs go here */
    

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitCreate_state(squealParser.Create_stateContext ctx) {
        String table_name = ctx.table_name().NAME().getText();  // id is left-hand side of '='
        JSONObject columnDefs = new JSONObject();
        for (int i = 0; i < ctx.columndef().size(); i++) {
            columnDefs.put(
            ctx.columndef().get(i).column_name().getText(),
            ctx.columndef().get(i).data_type().getText());
        }
        try (FileWriter file = new FileWriter("databases/"+table_name+".json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(columnDefs.toJSONString()); 
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Se creó la tabla: "+table_name+
        ". Con "+ ctx.columndef().size() + " columnas.");
        return 1;
    }

    @Override
    public Integer visitInsert_state(squealParser.Insert_stateContext ctx) {
        String table_name = ctx.table_name().NAME().getText();  // id is left-hand side of '='
        JSONObject columnDefs = new JSONObject();
        for (int i = 0; i < ctx.column_name().size(); i++) {
            columnDefs.put(
            ctx.column_name().get(i).NAME().getText(),
            ctx.term().get(i).getText());
        }
        try (FileWriter file = new FileWriter("databases/"+table_name+".json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(columnDefs.toJSONString()); 
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Se ingresó la entrada a la tabla: "+table_name);
        return 1;
    }
}