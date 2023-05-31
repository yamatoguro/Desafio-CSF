import { Component, OnInit } from '@angular/core';
import { NbDialogService, NbSearchService } from '@nebular/theme';
import { DialogService } from 'src/app/service/dialog.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  caixaAberto = true;
  activeTab = "";
  troco = 250.75;
  saldo = 18550.35;
  ngOnInit(): void {}


  onChangeTab(event: any) {
    this.activeTab = event.tabTitle;
  }
}
