import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test {

	private static final Logger log = LoggerFactory.getLogger(test.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
//		log.debug(calendar.getTime().toString());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
		log.debug(df.format(calendar.getTime()));
//		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");   
	}

}
