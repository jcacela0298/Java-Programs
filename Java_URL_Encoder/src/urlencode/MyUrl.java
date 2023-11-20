package urlencode;

public class MyUrl {
	
	private String mUrl = new String();
	private String formattedCombo;
		
		public MyUrl(String url) {
		
		if (!url.startsWith("http://")) {
			this.mUrl = "http://" + url;
		}
		else {
			this.mUrl = url;
		}
		}	
		public void addArgument (String name, String value){
			 String formattedName = urlEncode(name);
			 String formattedValue = urlEncode(value);
			 
			 if (formattedCombo == null) {
			        formattedCombo = formattedName + "=" + formattedValue;
			    } else {
			        formattedCombo += "&" + formattedName + "=" + formattedValue;
			    }
			}
		public void addArgument (String name, int ivalue){
			 String formattedName = urlEncode(name);
			 String formattedValue = Integer.toString(ivalue);
			 
			 if (formattedCombo == null) {
			        formattedCombo = formattedName + "=" + formattedValue;
			    } else {
			        formattedCombo += "&" + formattedName + "=" + formattedValue;
			    }
			}
		public void addArgument(String name, double dvalue) {
		    String formattedName = urlEncode(name);
		    String formattedValue = Double.toString(dvalue);

		    if (formattedCombo == null) {
		        formattedCombo = formattedName + "=" + formattedValue;
		    } else {
		        formattedCombo += "&" + formattedName + "=" + formattedValue;
		    }
		}

		public String toString() {
			String finalUrl = this.mUrl + "?" + formattedCombo;
			return finalUrl;
		}
		
		public static String urlEncode(String text) {
		String modifiedQuote = new String("");
	        String normalChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_-.*";

	            for (int n = 0; n < text.length(); ++n) {
	                char currentCharacter = text.charAt(n);
	                    if (currentCharacter == ' ') {
	                        modifiedQuote += '+';

	                    }
	                    else if(normalChars.indexOf(currentCharacter) == -1){
	                        String hexValue = Integer.toHexString((int)currentCharacter);
	                        modifiedQuote += '%' + hexValue;                        
	                    }
	                    else{
	                        modifiedQuote += currentCharacter;
	                    }
	            }
	            return modifiedQuote;
		}	
	}
