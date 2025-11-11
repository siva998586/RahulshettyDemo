package Basic;


		public class Sample_String {
		    public static void main(String[] args) {
		    	String str= "a";
		    	 //str= "b";
		       System.out.println("Comapared to 'b' " + str.compareTo("b"));
		       
		       str= "b";
		       System.out.println("Comapared to 'a' " + str.compareTo("a"));
		       
		       str= "b";
		       System.out.println("Comapared to 'a' " + str.compareTo("b"));
		       
		       
		       
		     //Compare to a String
		        String str_Sample = "RockStar";
		        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
		        //Compare to - Ignore case
		        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
		        
		        
		        String s1 = "Guru1";
		        String s2 = "Guru2";
		        System.out.println("String 1: " + s1);
		        System.out.println("String 2: " + s2);
		   
		     // Compare the two strings. 
		        int S = s1.compareTo(s2);
		        System.out.println("String: " + S);
		        // Show the results of the comparison.  
		        if (S < 0) {
		            System.out.println("\"" + s1 + "\"" + " is lexicographically higher than " + "\"" + s2 + "\"");
		        } else if (S == 0) {
		            System.out.println("\"" + s1 + "\"" + " is lexicographically  equal to " + "\"" + s2 + "\"");
		        } else if (S > 0) {
		            System.out.println("\"" + s1 + "\"" + " is lexicographically less than " + "\"" + s2 + "\"");
		        }
		        
		    }
		
		       
		    }


