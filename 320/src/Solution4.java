import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunxiaozou on 6/7/16.
 */
public class Solution4 {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        DFS(res, new StringBuilder(), word.toCharArray(), 0, 0);
        return res;
    }

    public void DFS(List<String> res, StringBuilder sb, char[] c, int i, int num) {
        int len = sb.length();
        if(i == c.length) {
            if(num != 0) sb.append(num);
            res.add(sb.toString());
        } else {
            DFS(res, sb, c, i + 1, num + 1);               // abbr c[i]

            if(num != 0) sb.append(num);                   // not abbr c[i]
            DFS(res, sb.append(c[i]), c, i + 1, 0);
        }
        sb.setLength(len);
    }
}
