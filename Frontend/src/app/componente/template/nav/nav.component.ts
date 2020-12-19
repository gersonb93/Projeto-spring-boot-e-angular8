import { UsuarioService } from './../../../service/usuario.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/User';


@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  title = 'Angular-REST';
  students: Array<User[]>;
  nome: String;
  total: number;
  p: number;

  constructor(private router: Router, private usuarioService: UsuarioService) {

  }

  ngOnInit(): void {

    if (localStorage.getItem('token') == null) {
      this.router.navigate(['login']);
    }

  }

  public sair() {
    localStorage.clear();
    this.router.navigate(['login']);
  }



  public esconderBarrar() {

    if (localStorage.getItem('token') !== null &&
      localStorage.getItem('token').toString().trim() !== null) {
      return false;
    } else {
      return true;
    }

  }

  consultarUser() {

    if (this.nome === '') {
      this.usuarioService.getStudentList().subscribe(data => {
        this.students = data.content;
        this.total = data.totalElements;
      });
    } else {

      this.usuarioService.consultarUser(this.nome).subscribe(data => {
        this.students = data.content;
        this.total = data.totalElements;
      });
    }
  }


}
