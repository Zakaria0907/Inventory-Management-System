package com.zakaria.inventorymanagement.entity;
import com.zakaria.inventorymanagement.entity.enums.MovementSource;
import com.zakaria.inventorymanagement.entity.enums.MovementType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name= "stockmovement")
public class InventoryMovement extends AbstractEntity {
	
	@Column(name = "company_id")
	private Integer companyId;
	
	@Column(name = "movementdate")
	private Instant MovementDate;
	
	@Column(name = "quantity")
	private BigDecimal quantity;
	
	@Column(name = "movementtype")
	private MovementType movementType;
	
	@Column(name = "mouvementsource")
	@Enumerated(EnumType.STRING)
	private MovementSource movementSource;
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;
}