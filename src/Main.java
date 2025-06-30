
//Write a Java program to create a stack using Stack collection.
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        //Stack is a LIFO kinda Algorithm basically
        //Meaning if you stack IFT,JAVA,INS, Maths notes together in this order
        // and Maths note happens to be the last one you put on
        // all the notes remember "Maths note is what you added last you'd have
        // to remove the Maths note first hence they calling it Last in First out
        // it means last in first out shey you get???
        //It's not that deep .........lol

        //So basically this is question 1 for LSQ sha
        //so let's enter the body of the code

        //------------Question_1--------------
        //Write a Java program to create a
        // stack using Stack collection
        Stack<String> stack = new Stack<>();

        //By now I know most of you are already used to this instantiating drama nau .....
        // ehen it is the same thing we are doing here now


        //Get used to it the angular bracket tells the stack method
        // to only accept string all you need to know is to understand
        // the basic principles sha like I said it is not that deep

        stack.push("Java");
        stack.push("IFT");
        stack.push("INS");
        stack.push("Maths");
        //Now you fit dey panic dey ask wetin be this again but chillax again
        // I say chillax shey you get remember our quote
        //"It's not that deep" there is a method called "Push" and what that push
        // does is to add items to the Stack we are creating


        //Now you see this line of code beneath
        // sha that you are seeing the only thing it does
        // is to return a boolean value
        System.out.println(stack.empty());



        //Now the line of code beneath don't tell anybody ooo what it does sha is to
        // print the stack sha that's all
        System.out.println(stack);


        //Are you enjoying Stack? I hope you understand the concepts behind stack now ?

        //Now it is time for us to look at another method stack has to offer which is Pop
        //You see anytime you use this pop method ehn what it does is to remove the head of stack
        // sha what do i mean by the head
        //The last element in the stack is the head and the tail is the first element
        //Don't forget the analogy of books so you don't get confused with the line above

        stack.pop();
        //So automatically it removes Maths and makes INS the new head
        stack.pop();
        //So automatically it removes INS and makes IFT the new head i hope you get the gist now
        System.out.println(stack);


        //Guess what this does ????????
        String myCourses = stack.pop();
        System.out.println(myCourses);
    }
}