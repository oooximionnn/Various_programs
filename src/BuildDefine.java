public class BuildDefine {
    public static String buildDefinitionList(String[][] definitions) {
        if (definitions.length == 0) {
            return "";
        }

        var result = new StringBuilder();
        result.append("<dl>");
        for (var definition : definitions) {
            var name = definition[0];
            var description = definition[1];

            result.append("<dt>");
            result.append(name);
            result.append("</dt>");

            result.append("<dd>");
            result.append(description);
            result.append("</dd>");
        }
        result.append("</dl>");

        return result.toString();
    }
}