package sys2_2.util;
/**
 * �ַ�������
 * @author 
 *
 */
public class StringUtil {
/**
 * �ж��ַ����Ƿ�Ϊ��
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
	 * �жϲ�Ϊ��
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
