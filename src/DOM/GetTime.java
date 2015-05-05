package DOM;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {

	public static String  getTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String time = df.format(new Date());
		return time;
	}
}
