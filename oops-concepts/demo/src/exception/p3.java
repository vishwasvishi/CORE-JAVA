package exception;

class p3 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("abc");
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("From Catch-1");
        } 
        catch (RuntimeException e) {
            System.out.println("From catch 2");
        } 
        catch (Exception e) {
            System.out.println("From catch-3");
        } 
        catch (Throwable e) {
            System.out.println("From catch-4");
        }
    }
}