<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1>TR-Optimizer 2.1</h1>

      <hr noshade size="1" />

      <div class="infoPics">
        <img SRC="@/assets/tr-Optimizer1.gif" />
      </div>

      <hr noshade size="1" />

      <h2>Beschreibung der Methode:</h2>
      <p>
        TR-Optimizer ist ein Programm der OR-Methodenbank zum Optimieren von
        Transportproblemen. Die Besonderheit daran ist die M&ouml;glichkeit
        zwischen verschiedenen Transportalternativen zu unterscheiden. <br />
        TR-Optimizer berechnet kapazit&auml;tsabh&auml;ngig die optimale
        L&ouml;sung von Transportproblemen. Dabei sind L&ouml;sungen f&uuml;r
        den Fall &quot;Produzierte Menge > Nachgefragte Menge&quot;
        ber&uuml;cksichtigt. Ebenfalls werden verschiedene Transportalternativen
        ber&uuml;cksichtigt. TR-Optimizer kann &uuml;ber Drag & Drop von
        grafischen Elementen bedient werden. Speichern und &ouml;ffnen bereits
        definierter Probleme ist m&ouml;glich.
      </p>
      <p>
        <b>Performance:</b>
        <br />
        Grenze liegt bei 9 Empf&auml;ngern und 4 Produzenten.
      </p>
    </div>
    <div>
      <!-- <a href="">Zur Methode</a> TODO-->
      <router-link :to="{ path: '/DownloadCenter', hash: '#TR_Optimizer' }"
        >Download</router-link
      >
    </div>
  </v-container>
</template>