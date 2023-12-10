public class Trees {

    public static void main(String[] args) {
        
    System.out.println("4.1 Root Node: html");
    
    System.out.println("4.2 Parent Nodes:  html, head, body, ul, h2 ");
    
    System.out.println("4.3 Siblings:  head and body, meta and title, ul and h1 and h2, li and li2");
    
    System.out.println("4.4 One - Level Subtrees: html-head/body, head- meta/title, body-ul/h1/h2, ul-li/li, h2-a");
    
    System.out.println("4.5 Nodes per Level:\n Level 0- html\n" +" Level 1- head, body\n" +" Level 2- meta, title, ul, h1, h2\n" +" Level 3- li, li, a " );
    
    System.out.println("4.6 Depth: 3 " );
    
    System.out.println("4.7 Degree of each One - level Subtrees:\nhtml- 2\n" + "head- 2\n" + "body- 3\n" + "ul- 2\n" + "h2- 1" );
    
    System.out.println("4.8 List of Nodes based on Breadth - First: \n html / head / body / meta / title / ul / h1 / h2 / li / li / a " );
    
    System.out.println("4.8 List of Nodes based on Pre - Order: \n html / head / meta / title / body / ul / li / li / h1 / h2 / a " );
    
    System.out.println("4.8 List of Nodes based on Post - Order: \n meta / title / head / li / li / ul / body / h1 / a / h2 / html  " );
    
    }
}