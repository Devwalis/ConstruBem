# ConstruBem API 🏗️

Bem-vindo ao repositório backend do **ConstruBem**, o e-commerce focado em construção civil, reformas e decoração.

## 🎯 Objetivo
Fornecer uma API REST robusta, escalável e preparada para o ciclo de vida de um software moderno, utilizando Java 21, Spring Boot e PostgreSQL.

## 📚 Documentação
A documentação técnica está dividida na pasta `/docs`:
- [Arquitetura](docs/ARCHITECTURE.md)
- [Infraestrutura AWS](docs/INFRASTRUCTURE.md)
- [Banco de Dados](docs/DATABASE.md)
- [Documentação da API](docs/API.md)

## 🚀 Como rodar o projeto localmente
1. Suba o banco de dados: `docker-compose up -d`
2. Rode a aplicação: `./mvnw spring-boot:run`
3. Acesse o Health Check: `http://localhost:8080/actuator/health`

## 🔒 Segurança (Roadmap)
- [ ] Autenticação OAuth2 / JWT
- [ ] Hash de senha com BCrypt
- [ ] Ciclo de vida de tokens (Access/Refresh)