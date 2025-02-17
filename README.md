``` mermaid
erDiagram
    PROJECT {
        int id PK
        string name
        string description
        date start_date
        date end_date
        string status
        int client_id FK
    }

    CLIENT {
        int id PK
        string name
        string email
        string phone
        string company
    }

    USER {
        int id PK
        string name
        string email
        string role
    }

    TEAM {
        int id PK
        string name
        int project_id FK
    }

    TEAM_USER {
        int team_id PK, FK
        int user_id PK, FK
        string function
    }

    TASK {
        int id PK
        string title
        string description
        string status
        date deadline
        int project_id FK
        int user_id FK
    }

    REPORT {
        int id PK
        string description
        date creation_date
        int project_id FK
    }

    PROJECT ||--o{ CLIENT : belongs_to
    PROJECT ||--o{ TEAM : has
    TEAM ||--o{ TEAM_USER : associates
    USER ||--o{ TEAM_USER : belongs_to
    PROJECT ||--o{ TASK : contains
    USER ||--o{ TASK : responsible_for
    PROJECT ||--o{ REPORT : generates
```
