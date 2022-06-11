package Q110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		int postDetailsCount=Integer.parseInt(bufferedReader.readLine().trim());
		
		List<String> postDetails =IntStream.range(0, postDetailsCount).mapToObj(i->{
			
			
			
			try {
				return bufferedReader.readLine();
			}catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
			.collect(Tolist());
			
			
		
			Result.findMostPopularTopic(postDetails);
			bufferedReader.close();
		
		
		}
	}

	public void findMostPopularTopic(List<String> post){
			 
	}
}