<template>
  <div class="about">
    <v-breadcrumbs :items="items" large></v-breadcrumbs>
    <template>
      <v-container>
        <v-card>
           <div>
            <v-text-field v-model="search" label="Search" class="mx-4" single-line/>
          <v-data-table
            :headers="headers"
            :items="method"
            :items-per-page="20"
            :search="search"
            sort-by="name"
            group-by="Kategorie"
            class="elevation-1"
            disable-pagination
            hide-default-footer
          >
            <template
              v-slot:[`group.header`]="{ group, headers, toggle, isOpen }"
            >
              <td
                :colspan="headers.length"
                @click="toggle"
                :ref="group"
                class="hover"
              >
                <v-btn small icon>
                  <v-icon v-if="isOpen">mdi-minus</v-icon>
                  <v-icon v-else>mdi-plus</v-icon>
                </v-btn>
                <span
                  class="mx-5 font-weight-bold"
                  @mouseover.native="hover = true"
                  @mouseleave.native="hover = false"
                >
                  {{ group }}
                </span>
              </td>
            </template>
            <template v-slot:[`item.name`]="{ item }">
              <v-btn :to="item.start" depressed plain class="text-capitalize">{{
                item.name
              }}</v-btn>
            </template>
            <template v-slot:[`item.start`]="{ item }">
              <v-btn text icon :to="item.start">
                <v-icon>mdi-information-outline</v-icon>
              </v-btn>
            </template>
            <template v-slot:[`item.download`]="{ item }">
              <v-btn text icon :to="item.download">
                <v-icon>mdi-download</v-icon>
              </v-btn>
            </template>
          </v-data-table>
          </div>
        </v-card>
      </v-container>
    </template>
  </div>
</template>
<script>
export default {
  data: () => ({
    items: [
      {
        text: "Home",
        disabled: false,
        href: "/",
      },
      {
        text: "Methodenübersicht",
        disabled: true,
      },
    ],
    search: "",
    headers: [
      { text: "Methodenname", align: "start", value: "name", groupable: false },
      { text: "Kategorie", align: "left", value: "Kategorie" },
      { text: "Details", align: "center", value: "start", sortable: false },
      { text: "Download", align: "center", value: "download", sortable: false },
    ],
    method: [
      {
        name: "Wagner-Whitin-LP 1.3",
        Kategorie: "Bestellmengenplanung",
        start: "WagnerWhitinLP",
        download: "DownloadCenter#WagnerWhitinLP",
      },
      {
        name: "Wagner-Whitin 1.2",
        Kategorie: "Bestellmengenplanung",
        start: "WagnerWhitin",
        download: "DownloadCenter#WagnerWhitin",
      },
      {
        name: "TR-Optimizer 2.1",
        Kategorie: "Transportplanung",
        start: "TR_Optimizer",
        download: "DownloadCenter#TR_Optimizer",
      },
      {
        name: "PTSS - Paket Transport Simulation System 1.1",
        Kategorie: "Transportplanung",
        start: "PTSS",
        download: "DownloadCenter#PTSS",
      },
      {
        name: "BOP - Beladungsoptimierung 1.1",
        Kategorie: "Transportplanung",
        start: "BOP",
        download: "DownloadCenter#BOP",
      },
      {
        name: "Eisenstadt 1.4",
        Kategorie: "Standortplanung",
        start: "Eisenstadt",
        download: "DownloadCenter#Eisenstadt",
      },
      {
        name: "Innerbetriebliche Standortplanung 1.1",
        Kategorie: "Standortplanung",
        start: "IB_Standortplanung",
        download: "DownloadCenter#IB_Standortplanung",
      },
      {
        name: "Standortplanung 3.0",
        Kategorie: "Standortplanung",
        start: "Standortplanung",
        download: "DownloadCenter#Standortplanung",
      },
      {
        name: "Leitstand Pflegestation 1.1",
        Kategorie: "Personalplanung",
        start: "Leitstand_Pflegestation",
        download: "DownloadCenter#Leitstand_Pflegestation",
      },
      {
        name: "Lineare Portfolio Optimierung 2.0",
        Kategorie: "Personalplanung",
        start: "Portfolio_Optimierung",
        download: "DownloadCenter#Portfolio_Optimierung",
      },
      {
        name: "Roundtrip 0.9",
        Kategorie: "Personalplanung",
        start: "Roundtrip",
        download: "DownloadCenter#Roundtrip",
      },
      {
        name: "Job Shop 2.2",
        Kategorie: "Personalplanung",
        start: "JobShop",
        download: "DownloadCenter#JobShop",
      },
      {
        name: "Verkehrsplaner",
        Kategorie: "Personalplanung",
        start: "Verkehrsplaner",
        download: "DownloadCenter#Verkehrsplaner",
      },
      {
        name: "Maschinenbelegungsplanung 5.2",
        Kategorie: "Personalplanung",
        start: "Maschinenbelegungsplanung",
        download: "DownloadCenter#Maschinenbelegungsplanung",
      },
      {
        name: "OP-Scheduling 2.3",
        Kategorie: "Personalplanung",
        start: "OP_Scheduling",
        download: "DownloadCenter#OP_Scheduling",
      },
      {
        name: "Ernährungsplaner 2.0",
        Kategorie: "Personalplanung",
        start: "Ernaehrungsplaner",
        download: "DownloadCenter#Ernaehrungsplaner",
      },
      {
        name: "Einkaufswagenoptimierung 1.0",
        Kategorie: "Personalplanung",
        start: "Einkaufswagen",
        download: "DownloadCenter#Einkaufswagen",
      },
    ],
  }),
  hover: false,
};
</script>
<style lang="scss">
@import "@/assets/css/style.scss";
</style>