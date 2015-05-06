function createParagraph(id, text) {
    var paragraph = document.createElement("p");
    var node = document.createTextNode(text);
    paragraph.appendChild(node);

    var element = document.getElementById(id);
    element.appendChild(paragraph);
}
createParagraph('wrapper', 'Some text');