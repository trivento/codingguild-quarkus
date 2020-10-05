import { Component, OnInit } from '@angular/core';
import { Persoon } from '../persoon';
import { PersoonService } from '../persoon.service';

@Component({
  selector: 'app-persoon-lijst',
  templateUrl: './persoon-lijst.component.html',
  styleUrls: ['./persoon-lijst.component.scss']
})
export class PersoonLijstComponent implements OnInit {

  personen: Persoon[];
  constructor(private persoonService: PersoonService) { }


  ngOnInit(): void {
    this.persoonService.getPersonen().subscribe(personen => this.personen = personen);
  }

}
