import sys # módulo que permite escrever no terminal
import os # garantir que files sejam criados na mesma pasta


# Configuração de caminhos

base_path = os.path.dirname(os.path.abspath(__file__))
temp_path = os.path.join(base_path, 'temp.txt')
temp2_path = os.path.join(base_path, 'temp2.txt')


# Criando e escrevendo dados em um arquivo

# Aqui, criamos um arquivo chamado "temp.txt" no modo escrita (write).
# O modo 'w' apaga o conteúdo antigo (se o arquivo já existir) e cria um novo

with open(temp_path, 'w', encoding="utf-8") as temp: # Laço
    for i in range(100):
        temp.write('%03d\n' % i)

# Não precisa do temp.close() quando usamos with open()
# Garantindo que os dados estão gravados no disco


# Lendo e exibindo conteúdo do arquivo

# Primeiro, abrir o arquivo que criamos em modo leitura

with open(temp_path, 'r', encoding='utf-8') as temp:
    # Laço pra percorrer cada linha e escrever no terminal
    # Explicação da variável Linha:
    # Quando fazemos for X in Y:, o Python entende que você quer percorrer cada item de Y.
    # Ele cria automaticamente a variável X para representar cada item em cada repetição do loop.
    # temp é o objeto iterável, a coleção de dados
    # linha é a variável temporária , que vai receber cada item de temp
    # y → é o “todo” (a lista, o arquivo, o conjunto de dados).
    # x → é cada parte individual de y (cada linha, número, ou valor).
    for linha in temp:
        sys.stdout.write(linha)


# Lendo os dados e colocando em um vetor ordenado

# with open() é uma forma mais moderna e segura de abrir arquivos.
# Ele fecha o arquivo automaticamente ao final do bloco.

with open(temp_path,'r', encoding='utf-8') as f: 
    linhas = f.readlines() # Lê todas as linhas e guarda numa lista (cada linha é um item).
# cria uma variável chamada f que representa esse arquivo aberto
# dentro desse bloco, você usa f pra ler ou escrever no arquivo.

# Criando lista vazia para armazenar no vetor
vetor = []

# Percorrendo todas as linhas para adicionar ao vetor usando append()
# append() adiciona um elemento no final da lista.

for linha in linhas:
    # strip() remove o '\n' do final de cada linha (e espaços extras).
    linha = linha.strip()

    # Se a linha não estiver vazia, adicionamos no vetor convertendo para inteiro.
    if linha != "":
        vetor.append(int(linha))
# linha é o x (o elemento individual)
# linhas é o y (o conjunto de onde os elementos vêm)


# Ordenando com bubble sort()

n = len(vetor)
# n → tamanho total da lista.
# i → o número da passada atual (0, 1, 2, ...).
# -1 → porque o laço interno usa vetor[j + 1]
# então o j não pode chegar até o último índice
# senão daria erro.
for i in range(n-1):
    for j in range(n-i-1):
        if vetor[j] > vetor[j+1]: # esquerda > que direita
            vetor[j], vetor[j + 1] = vetor[j + 1], vetor[j] # troca


# Gravando os dados e guardando em um novo arquivo

with open(temp2_path, 'w', encoding='utf-8') as f:
    # Escrevemos cada número do vetor, um por linha.
    for item in vetor:
        # :03d → formata com 3 dígitos (001, 002, etc.)
        f.write(f"{item:03d}\n")


# Exibindo resultado 

print("\n\nConteúdo ordenado gravado em temp2.txt:")
print(vetor)  # Mostra o vetor inteiro no terminal
