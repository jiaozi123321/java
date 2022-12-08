package sys2_2.util;
/**
 * ×Ö·û´®¹¤¾ß
 * @author 
 *
 */
public class StringUtil {
/**
 * ÅÐ¶Ï×Ö·û´®ÊÇ·ñÎª¿Õ
 * @param str
 * @return
 */
	public static boolean isEmpty(String str) {
		if(str==null||"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
		
	}
	/**
	 * ÅÐ¶Ï²»Îª¿Õ
	 * @param str
	 * @return
	 */
	public static boolean isNotEmptt(String str) {
		if(str !=null &&"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
}
