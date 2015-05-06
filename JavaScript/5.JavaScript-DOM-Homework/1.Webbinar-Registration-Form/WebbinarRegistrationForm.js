window.onload = function () {
    document.getElementById('checkbox').onclick = function () {
        if (this.checked)
            document.getElementById('hidden').style.display = 'block';
        else
            document.getElementById('hidden').style.display = 'none';
    }
};