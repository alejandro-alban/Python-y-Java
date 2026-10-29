monto = float(input("Ingrese el monto del préstamo: "))
tasa = float(input("Ingrese la tasa de interés trimestral (en decimal, ej. 0.05): "))
trimestres = int(input("Ingrese el número de trimestres: "))
abono_porcentaje = float(input("Ingrese el porcentaje de abono extraordinario (ej. 10 para 10%): "))
# Cálculos
monto_total = monto * (1 + tasa) ** trimestres
# Interés compuesto
abono = monto_total * (abono_porcentaje / 100)
# Abono extraordinario
monto_final = monto_total - abono
# Monto final
# Salida de resultados
print (f"Monto total antes del abono: {monto_total:.2f}")
print (f"Valor del abono extraordinario: {abono:.2f}")
print (f"Monto final a pagar: {monto_final:.2f}")