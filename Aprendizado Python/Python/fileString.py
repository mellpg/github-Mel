import sys
import os
import unicodedata  # Usado para remover acentos

# Função normalização de textos
def normal(txt):
    # tudo minúsculo
    txt = txt.lower()

    # separar acento das letras
    txt = unicodedata.normalize("NFD", txt)

    # remover acentos
    txt = "".join(c for c in txt if unicodedata.category(c) != "Mn")

    return txt


# Configuração de caminhos
base_path = os.path.dirname(os.path.abspath(__file__))

# Definir nome do novo arquivo
base_path = os.path.dirname(os.path.abspath(__file__))
temp_path = os.path.join(base_path, "fileString.txt")
temp3_path = os.path.join(base_path, "temp3.txt")

# Criando e escrevendo
with open(temp_path,'w',  encoding="utf-8") as f:
    f.write("Título: Reflexão | Autor: Mel | Texto: A vida é feita de ciclos.\n")
    f.write("Título: Bom dia | Autor: Pedro | Texto: Hoje o dia amanheceu lindo!\n")
    f.write("Título: Noite | Autor: João | Texto: Gosto do silêncio da noite.\n")
    f.write("Título: Filme | Autor: Mel | Texto: Amei Chainsaw man.\n")
    f.write("Título: Bom dia | Autor: Gaby | Texto: Vou estudar pela tarde e você?\n")
    f.write("Título: Fome| Autor: Gabriel | Texto: Quero comer pizza.\n")


# Lendo e mostrando conteúdo original

print("Conteudo original:")
with open(temp_path,'r', encoding= "utf-8") as f:
    for linha in f:
         sys.stdout.write(linha)


# Lendo dados para inserir no vetor
with open(temp_path,'r', encoding= "utf-8") as f:
    linhas = f.readlines()


vetor = []

for linha in linhas:
    linha = linha.strip()
    if linha == "":
       continue
    # Vai separar a String
    # Ficando:
    # partes = [
 #   "Título: A Vida",
 #   "Autor: João",
 #  "Texto: Era uma vez..."
# ]
#   split = dividir uma string em partes, gerando uma lista.
# Melhor forma, aceita qualquer formato e não exige espaço
    partes = [p.strip() for p in linha.split("|")]


    # Funcionamento do split:
    # texto = "aprendendo Python com o split"
    # palavras = texto.split()
    # palavras agora é ['aprendendo', 'Python', 'com', 'o', 'split']


    titulo = partes[0].replace("Título: ", "")
    autor = partes[1].replace("Autor: ", "")
    texto = partes[2].replace("Texto: ", "")

    # Juntando tudo em uma lista organizada
    # Ficando:
    # {
 #   "titulo": "A Vida",
 #   "autor": "João",
 #   "texto": "Era uma vez..."
# }
# Criando as haves
    item = {
        "titulo": titulo,
        "autor": autor,
        "texto": texto
    }

    vetor.append(item)


# Ordenando usando bubble sort pelo título e ignorando acentos
n = len(vetor)

for i in range(n-1):
    for j in range(n-i-1):
        tituloA = normal(vetor[j]["titulo"])
        tituloB = normal(vetor[j + 1]["titulo"])

        if tituloA > tituloB:
            vetor[j], vetor[j + 1] = vetor[j + 1], vetor[j]

# Gravando no temp3
with open(temp3_path, "w", encoding="utf-8") as f:
    for item in vetor:
        linha = f"Título: {item['titulo']} | Autor: {item['autor']} | Texto: {item['texto']}\n"
        f.write(linha)

# Exibindo vetor ordenado

print("\n\nConteúdo ordenado (títulos ignorando acentos):")
for item in vetor:
    print(f"{item['titulo']} - {item['autor']} - {item['texto']}")







