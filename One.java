//reversing the order of terms of an algebraic expression that contains only 4 basic math operators without changing the order and the number itself e.g for input "5+6*7-60" output should be "60-7*6+5"

class One
{
public static void main(String args[])
{

String str=args[0];
String reverse="";

int pos=str.length()-1;

String term="";

for(int k=0;k<str.length();k++)
{
char ch=str.charAt(pos--);

	switch(ch)
	{
	case '-':
	case '+':	
	case '/':
	case '*': 
		reverse=reverse+term+ch;
		term="";
		break;
	default:	
		term=ch+term;
	}

}

System.out.println("reverse is "+(reverse+term));
}

}
