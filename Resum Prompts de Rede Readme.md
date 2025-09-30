
🔍 Diagnóstico e Teste de Conexão

ping <endereço> → Testa a conectividade com outro dispositivo ou site.
Ex: ping google.com

tracert <endereço> → Mostra a rota (saltos) que os pacotes percorrem até o destino.

pathping <endereço> → Combina ping e tracert, mostrando latência e perda de pacotes em cada salto.



---

🌐 Configuração e Informações de IP

ipconfig → Mostra informações básicas da rede (IP, máscara, gateway).

ipconfig /all → Mostra informações detalhadas (inclui DNS, MAC address, DHCP).

ipconfig /release → Libera o endereço IP atual.

ipconfig /renew → Solicita um novo IP ao servidor DHCP.

ipconfig /flushdns → Limpa o cache DNS do Windows.



---

🖥️ Nome, Usuário e Sessões

hostname → Exibe o nome do computador.

whoami → Mostra o usuário logado no momento.

net user → Lista todos os usuários do sistema.



---

📡 Conexões Ativas e Portas

netstat → Mostra conexões ativas e portas abertas.

netstat -a → Mostra todas as conexões e portas em escuta.

netstat -n → Mostra conexões em formato numérico (sem resolver nomes).

netstat -o → Mostra o PID dos processos ligados às conexões.



---

📁 Compartilhamento e Rede Local

net view → Lista computadores na rede local.

net use → Conecta ou desconecta unidades de rede compartilhadas.
Ex: net use Z: \\PC01\Compartilhado

net share → Mostra ou cria compartilhamentos de pastas.



---

🌍 DNS e Nome de Domínio

nslookup <site> → Consulta servidores DNS para resolver nomes e IPs.

getmac → Mostra o endereço físico (MAC) da placa de rede.



---

🛠️ Ferramentas de Administração

arp -a → Mostra a tabela ARP (IP ↔ MAC address).

route print → Mostra a tabela de rotas.

route add → Adiciona rotas na tabela.

nbtstat → Diagnostica serviços NetBIOS em rede local.



---

✅ Esses são os principais prompts de rede no CMD, usados para:

Diagnosticar conexão.

Configurar IP/DNS.

Analisar portas e tráfego.

Gerenciar compartilhamentos.



---

Quer que eu monte isso em formato README.md bonitão de estudo (tipo guia de bolso), igual GitHub?

