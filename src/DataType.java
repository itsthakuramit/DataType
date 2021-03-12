
public class DataType {

		public static void main(String args[]) {

		        String input = "20.0";
		        String dataType = null;
		 
		     
		        if (input.matches("\\d+")) {
		            dataType = "Integer";
		        }
		 
		        else if (input.matches("\\d*[.]\\d+")) {
		            dataType = "Double";
		        }
		        else
		        	dataType ="String";
		        
		        System.out.print(dataType);
		
		}
		
	
}
