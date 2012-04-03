package cantabille.commons.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Keesun Baik
 */
public class ReflectionUtils {
	private ReflectionUtils() {}

	@SuppressWarnings("unchecked")
	public static <T> Class<T> getGenericTypeParam(Class<?> clazz, int idx) {
		ParameterizedType genericSuperclass = (ParameterizedType) clazz.getGenericSuperclass();
		Type type = genericSuperclass.getActualTypeArguments()[idx];

		if (type instanceof ParameterizedType) {
			return (Class<T>) ((ParameterizedType) type).getRawType();
		} else {
			return (Class<T>) type;
		}
	}
}
