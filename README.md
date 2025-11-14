# Análise de Caixa Branca

## 1. Notação de Grafo de Fluxo

**Aresta 1 para 2**: Começa o método conectarBD e entra no bloco try.

**Aresta 2 para 3**: Se o try falhar (dar erro), o fluxo pula para o catch (Nó 3).

**Aresta 2 para 4**: Se o try funcionar, o fluxo segue para o return conn (Nó 4).

**Aresta 5 para 6**: Prepara a SQL (Nó 5) e entra no bloco try (Nó 6).

**Aresta 6 para 7**: Dentro do try, executa a query no banco de dados (Nó 7).

**Aresta 7 para 10**: Se executar a query (Nó 7) falhar, o fluxo pula para o catch (Nó 10).

**Aresta 7 para 8**: Se executar a query (Nó 7) funcionar, o fluxo segue para o if (rs.next()) (Nó 8).

**Aresta 8 para 9**: Se if (rs.next()) for verdadeiro (encontrou usuário), o fluxo executa o Nó 9 (result = true).

**Aresta 8 para 11**: Se if (rs.next()) for falso (não encontrou usuário), o fluxo pula direto para o return result (Nó 11).

**Aresta 9 para 11**: Após definir result = true (Nó 9), o fluxo segue para o return result (Nó 11).

**Aresta 10 para 11**: Após o bloco catch (Nó 10), o fluxo segue para o return result (Nó 11).

---

## 2. Cálculo da Complexidade Ciclomática

* Arestas (E): 12
* Nós (N): 11 
* Metódos (P):2
  
**CÁLCULO:**
$V(G) = (12 - 11) + (2 * 2)$
$V(G) = 1 + 4 = 5$

**Conclusão:** A complexidade ciclomática total é **5**.

---

## 3. Conjunto de Caminhos Básicos

Os 5 caminhos básicos (V(G)=5) para a classe são:

* **CAMINHO 1** = 1 &rarr; 2 &rarr; 4
    *(Representa `conectarBD` com sucesso)*

* **CAMINHO 2** = 1 &rarr; 3 &rarr; 4
    *(Representa `conectarBD` com falha/exceção)*

* **CAMINHO 3** = 5 &rarr; 6 &rarr; 7 &rarr; 10 &rarr; 11
    *(Representa `verificarUsuario` com uma exceção no Nó 7, ex: `conn` nula)*

* **CAMINHO 4** = 5 &rarr; 6 &rarr; 7 &rarr; 8 &rarr; 11
    *(Representa `verificarUsuario` com login falho, onde o `if` (Nó 8) é falso)*

* **CAMINHO 5** = 5 &rarr; 6 &rarr; 7 &rarr; 8 &rarr; 9 &rarr; 11
    *(Representa `verificarUsuario` com login bem-sucedido, onde o `if` (Nó 8) é verdadeiro)*
