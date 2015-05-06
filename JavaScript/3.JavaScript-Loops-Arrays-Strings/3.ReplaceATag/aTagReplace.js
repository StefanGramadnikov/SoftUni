function replaceATag (str) {
    str = str.replace(/<a/g, "[URL");
    str = str.replace(/g>/g, "g]");
    str = str.replace(/<\/a>/g, "[/URL]");
    console.log(str);
}
replaceATag('<ul> <li> <a href=http://softuni.bg>SoftUni</a> </li> </ul>');