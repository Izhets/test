package ru.redcollar.test.model.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Time;
import java.time.Instant;

//
//"Автосервисный центр". В БД быть представлены следующие данные:
// фамилия, имя, отчество, контактный телефон владельца автотранспортного
// средства, номер, марка, дата выпуска автотранспортного средства, а также
// информация о дате обращения в автосервисный центр, о неисправностях и
// ремонте, если были произведены замены запчастей, то и данные об этих
// заменах (название и номер детали, которая была заменена), дата устранения
// всех неисправностей, а также данные о сотрудниках проводивших ремонт.
// Данные о сотрудниках включают в себя (фамилия, имя, отчество, дата
// рождения, адрес, контактные телефоны, должность, оклад, стаж, режим
// работы, надбавка за стаж).


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tikets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String clientSurname;
    private String clientName;
    private String clientPatronymic;

    private Long phoneNumber;

    private Long autoNumber;

    private String carBrand;

    private Time dateOfManufacture;

    private Instant createdAt = Instant.now();

    private String reasonForRequest;
}
