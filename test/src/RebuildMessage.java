public class RebuildMessage {
    public static void main(String args[]) {
        String[] parts1 = {"Ab", "bcZ"};
        String[] parts2 = {"*====#", "X-+-+-+-+-+-Z", "#________X", "A..........*"};

        System.out.println(rebuildMessage(parts2));
    }

    public static String rebuildMessage(String[] parts) {
        if (parts.length == 1) return parts[0];
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() > 1 && parts[i].charAt(0) != 'A') {
                for (int j = 0; j < parts.length; j++) {
                    if (parts[j].length() > 1 && parts[j].charAt(parts[j].length() - 1) == parts[i].charAt(0)) {
                        parts[j] = parts[j] + parts[i].substring(1);
                        parts[i] = "";
                        break;
                    }
                }
            }
        }
        for (String str : parts) {
            if (!str.equals("")) return str;
        }
        return "";
    }
}
