package hackerhank;

public class PropagatedException {

    void example() throws Exception{
        throw new Exception("Essa Exception sempre será lançada.");
    }

    public static void main(String[] args) {
        PropagatedException p = new PropagatedException();
        try{
            p.example();
        }
        catch(Exception e){
            System.err.println( e.getClass().getSimpleName() + ": " + e.getMessage() );
        }
    }

}
