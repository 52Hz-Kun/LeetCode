import java.util.*;

/**
 * 710. 黑名单中的随机数
 * 给定一个包含 [0，n) 中不重复整数的黑名单 blacklist ，写一个函数从 [0, n) 中返回一个不在 blacklist 中的随机整数。
 *
 * 对它进行优化使其尽量少调用系统方法 Math.random() 。
 */

public class Q710 {
    int[] whitelist;
    public Q710(int n, int[] blacklist) {
        Set<Integer> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        for (int i : blacklist) {
            set.remove(i);
        }
        whitelist = new int[n - blacklist.length];
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            whitelist[i++] = iterator.next();
        }
    }

    public int pick() {
        return whitelist[new Random().nextInt(whitelist.length)];
    }
}

class Q710_second {

    Map<Integer, Integer> m;
    Random r;
    int wlen;

    public Q710_second(int n, int[] b) {
        m = new HashMap<>();
        r = new Random();
        wlen = n - b.length;
        Set<Integer> w = new HashSet<>();
        for (int i = wlen; i < n; i++) w.add(i);
        for (int x : b) w.remove(x);
        Iterator<Integer> wi = w.iterator();
        for (int x : b)
            if (x < wlen)
                m.put(x, wi.next());
    }

    public int pick() {
        int k = r.nextInt(wlen);
        return m.getOrDefault(k, k);
    }
}
