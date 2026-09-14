# Great Tournament of Shields

Phase 1 (Journal):
- In a large-scale MMORPG, each “Guardian” is a player-controlled or AI-assisted unit with a DefenseRating that determines how much damage it can absorb before being destroyed. This value is used in combat calculations, matchmaking, and progression systems.
- If the game’s client code allowed outside code (e.g., a cheat tool like Cheat Engine) to directly write to the DefenseRating variable in memory, a player could instantly set it to a very high number. This would make the Guardian effectively invulnerable in combat, bypassing intended balance and damage formulas.

Phase 2 (Journal):
- When the fields went private, several errors occurred within the defenseRating and computedProperty.
- It was a struggle but I left it because it was too complicated to fix.
- It is preferred practice because it highlights the difference between public and private encapsulations.
