"use strict";

class FormBuilder {
  constructor(fields) {
    this.fields = fields;
  }

  createForm(containerId) {
    const container = document.getElementById(containerId);
    let html = "";

    this.fields.forEach(f => {
      html += `<label>${f.label}</label><br>
               <input type="${f.type}" id="${f.label}"><br><br>`;
    });

    html += `<button id="submitBtn">Submit</button>`;
    container.innerHTML = html;

    document.getElementById("submitBtn").onclick = () => {
      console.log(this.getFormData());
    };
  }

  getFormData() {
    const data = {};
    this.fields.forEach(f => {
      data[f.label] = document.getElementById(f.label).value;
    });
    return data;
  }
}


