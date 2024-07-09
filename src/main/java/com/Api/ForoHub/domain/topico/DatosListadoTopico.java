package com.Api.ForoHub.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String status,
        String autor,
        String curso
) {
    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(),
                topico.getMensaje(), topico.getFechaCreacion(),
                topico.getStatus().name(), topico.getAutor(), topico.getCurso());
    }
}
