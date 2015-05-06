var HTMLGen = {
    createParagraph: function(id, text){
      var paragraph = document.createElement('p');
      var node = document.createTextNode(text);
      paragraph.appendChild(node);

      var element = document.getElementById(id);
      element.appendChild(paragraph);
  },
    createDiv: function(id, clas) {
        var div = document.createElement('div');
        div.className = clas;

        var element = document.getElementById(id);
        element.appendChild(div);
    },
    createLink: function(id, text, url) {
        var link = document.createElement('a');
        var node = document.createTextNode(text);
        link.setAttribute('href', url);
        link.appendChild(node);

        var element = document.getElementById(id);
        element.appendChild(link);
    }
};
HTMLGen.createParagraph('wrapper', 'Soft Uni');
HTMLGen.createDiv('wrapper', 'section');
HTMLGen.createLink('book', 'C# basics book', 'http://www.introprogramming.info/');