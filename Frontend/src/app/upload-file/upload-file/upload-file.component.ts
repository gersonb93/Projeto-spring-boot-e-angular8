import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-upload-file',
  templateUrl: './upload-file.component.html',
  styleUrls: ['./upload-file.component.css']
})
export class UploadFileComponent implements OnInit {

  files: Set<File>;

  constructor() { }

  ngOnInit(): void {
  }

  onChange(event){

    console.log(event);

    const selectedFiles = <FileList>event.srcElement.files;

    const fileNames = [];
    this.files = new Set();

    document.getElementById('customFileLabel').innerHTML = selectedFiles[0].name;

    this.files.add(selectedFiles[0]);

  }

  onUpload(){

  }

}
