<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1>Beladungsoptimierung</h1>

      <hr noshade size="1" />

      <hr noshade size="1" />
      <div class="infoPics">
        <img src="@/assets/bop.jpg" />
      </div>
      <hr noshade size="1" />
      <h2>Beschreibung der Methode:</h2>

      <p>
        Nach der Eingabe verschiedener LKW- und Gebindetypen durch den Benutzer,
        sowie deren zu verladende Anzahl, errechnet der Prototyp die optimale
        Beladungsvariante für diesen Transportauftrag und stellt diese auf einer
        Auswertungsseite übersichtlich dar. Über die Register „Eingabe LKWs“ und
        „Eingabe Gebinde“ können die, für die spätere Berechnung relevanten
        Daten eingegeben werden.
      </p>
    </div>
    <div>
      <!-- <a href="">Zur Methode</a> TODO-->
      <router-link :to="{ path: '/DownloadCenter', hash: '#BOP' }"
        >Download</router-link
      >
    </div>
  </v-container>
</template>