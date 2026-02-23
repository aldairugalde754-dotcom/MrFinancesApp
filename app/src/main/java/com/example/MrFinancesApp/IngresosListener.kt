package com.example.MrFinancesApp
interface IngresosListener {
    fun onIngresosCargados(totalIngresos: Double, ingresosMensuales: List<Ingreso>, ingresosCasuales: List<Ingreso>)
}
