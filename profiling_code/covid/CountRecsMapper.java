import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class CountRecsMapper
	extends Mapper<Object, Text, Text, IntWritable>{
     
       private final static IntWritable one = new IntWritable(1);
       private Text word = new Text();

       public void map(Object key, Text value, Context context
                    ) throws IOException, InterruptedException {
	  String line = value.toString();
	  Text content = new Text ("Total number of records in this dataset: ");
	  word.set(content);
	  context.write(word, one);	 
}	
}
