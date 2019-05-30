import java.util.LinkedHashMap;
import java.util.Map;

public class LruCacheMap<K, V> extends LinkedHashMap<K, V> {
	/** シリアライズバージョン */
	private static final long serialVersionUID = 1L;

	/** キャッシュエントリ最大数 */
	private final int maxSize;

	/**
	 * 指定された最大数でインスタンスを作成
	 * @param maxSize 最大数
	 */
	public LruCacheMap(int maxSize) {
		super(15, 0.75f, true);
		this.maxSize = maxSize;
	}

	/** エントリの削除要否を判断 */
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > maxSize;
	}
}
