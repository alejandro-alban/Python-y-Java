n = int(input("Cantidad de notas: "))

suma = 0

for i in range(1, n + 1):
    nota = float(input("Ingrese una nota: "))
    suma = suma + nota

promedio = suma / n

print("Promedio:", promedio)