package com.backEnd.lucas.dto;

import com.backEnd.lucas.enuns.UserRole;

public record CadastroDTO(String login, String password, UserRole role) {
}
